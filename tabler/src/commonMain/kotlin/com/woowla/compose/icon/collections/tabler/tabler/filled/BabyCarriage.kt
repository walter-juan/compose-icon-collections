package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.49f, 6.858f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, -0.04f, 0.456f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, -3.757f, 5.103f)
                lineToRelative(0.532f, 1.595f)
                quadToRelative(0.135f, -0.012f, 0.275f, -0.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.894f, -1.966f)
                lineToRelative(-0.634f, -1.903f)
                quadToRelative(-0.377f, 0.045f, -0.765f, 0.045f)
                horizontalLineToRelative(-2.675f)
                quadToRelative(-0.547f, 0.0f, -1.076f, -0.083f)
                lineToRelative(-0.648f, 1.941f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.101f, 2.142f)
                lineToRelative(0.004f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.27f, -2.812f)
                lineToRelative(0.56f, -1.682f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -3.652f, -4.117f)
                lineToRelative(-1.402f, -4.213f)
                horizontalLineToRelative(-1.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineToRelative(1.104f, 3.316f)
                horizontalLineToRelative(6.447f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(8.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
