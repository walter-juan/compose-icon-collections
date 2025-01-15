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

public val FilledGroup.Rollercoaster: ImageVector
    get() {
        if (_rollercoaster != null) {
            return _rollercoaster!!
        }
        _rollercoaster = Builder(name = "Rollercoaster", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-1.675f)
                quadToRelative(-0.163f, 0.0f, -0.325f, 0.007f)
                verticalLineToRelative(10.993f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-10.645f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.0f, 0.959f)
                verticalLineToRelative(9.686f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-7.748f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -1.051f, 2.064f)
                lineToRelative(-0.735f, 2.205f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.213f, 0.553f)
                lineToRelative(-0.001f, 2.926f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineToRelative(0.001f, -0.364f)
                arcToRelative(6.54f, 6.54f, 0.0f, false, true, -4.001f, 1.364f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, 4.316f, -3.111f)
                lineToRelative(0.735f, -2.205f)
                arcToRelative(9.775f, 9.775f, 0.0f, false, true, 9.274f, -6.684f)
                close()
                moveTo(10.78f, 4.375f)
                lineToRelative(2.0f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.18f, 1.425f)
                lineToRelative(-4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.868f, 0.164f)
                lineToRelative(-1.8f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.727f, -0.864f)
                lineToRelative(-0.2f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.395f, -0.9f)
                lineToRelative(4.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.38f, 0.175f)
                moveToRelative(9.22f, -2.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _rollercoaster!!
    }

private var _rollercoaster: ImageVector? = null
