package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Ankermake: ImageVector
    get() {
        if (_ankermake != null) {
            return _ankermake!!
        }
        _ankermake = Builder(name = "Ankermake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.35f, 10.462f)
                lineToRelative(3.075f, 3.122f)
                curveToRelative(0.187f, 0.187f, 0.187f, 0.42f, 0.0f, 0.606f)
                lineToRelative(-3.122f, 3.123f)
                curveToRelative(-0.186f, 0.186f, -0.42f, 0.186f, -0.606f, 0.0f)
                lineTo(8.575f, 14.19f)
                curveToRelative(-0.187f, -0.186f, -0.187f, -0.419f, 0.0f, -0.606f)
                lineToRelative(3.169f, -3.122f)
                curveToRelative(0.186f, -0.186f, 0.419f, -0.186f, 0.606f, 0.0f)
                close()
                moveTo(10.765f, 8.878f)
                curveToRelative(0.14f, 0.186f, 0.14f, 0.419f, -0.047f, 0.605f)
                lineToRelative(-3.122f, 3.123f)
                curveToRelative(-0.186f, 0.186f, -0.419f, 0.186f, -0.606f, 0.0f)
                lineToRelative(-1.724f, -1.724f)
                verticalLineToRelative(12.675f)
                lineTo(0.0f, 23.557f)
                lineTo(0.0f, 0.443f)
                horizontalLineToRelative(2.33f)
                lineToRelative(8.435f, 8.435f)
                close()
                moveTo(21.717f, 0.443f)
                lineTo(24.0f, 0.443f)
                verticalLineToRelative(23.114f)
                horizontalLineToRelative(-5.266f)
                lineTo(18.734f, 10.882f)
                lineToRelative(-1.724f, 1.724f)
                curveToRelative(-0.187f, 0.186f, -0.42f, 0.186f, -0.606f, 0.0f)
                lineToRelative(-3.122f, -3.123f)
                curveToRelative(-0.187f, -0.186f, -0.187f, -0.419f, 0.0f, -0.605f)
                lineTo(21.717f, 0.443f)
                close()
            }
        }
        .build()
        return _ankermake!!
    }

private var _ankermake: ImageVector? = null
