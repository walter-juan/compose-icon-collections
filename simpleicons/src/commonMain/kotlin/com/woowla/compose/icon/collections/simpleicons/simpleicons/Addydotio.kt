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

public val Simpleicons.Addydotio: ImageVector
    get() {
        if (_addydotio != null) {
            return _addydotio!!
        }
        _addydotio = Builder(name = "Addydotio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.81f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.0f, -0.305f, -0.033f, -0.605f, -0.075f, -0.9f)
                curveTo(17.489f, 2.217f, 15.0f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(6.51f, 2.217f, 6.075f, 5.1f)
                arcTo(5.733f, 5.733f, 0.0f, false, false, 6.0f, 6.0f)
                verticalLineToRelative(0.81f)
                arcTo(5.987f, 5.987f, 0.0f, false, false, 3.0f, 12.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, -1.655f, -1.345f, -3.0f, -3.0f, -3.0f)
                lineTo(9.0f, 21.0f)
                curveToRelative(-1.655f, 0.0f, -3.0f, -1.345f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.655f, 1.345f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.345f, 3.0f, 3.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.5f, 2.597f)
                lineTo(16.5f, 12.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(9.0f, 10.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.055f, 0.0f, 2.04f, -0.272f, 2.902f, -0.75f)
                arcTo(5.996f, 5.996f, 0.0f, false, false, 21.0f, 13.5f)
                lineTo(21.0f, 12.0f)
                arcToRelative(5.987f, 5.987f, 0.0f, false, false, -3.0f, -5.19f)
                close()
                moveTo(13.5f, 16.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(0.0f, -0.548f, 0.15f, -1.06f, 0.408f, -1.5f)
                arcTo(2.998f, 2.998f, 0.0f, false, true, 12.0f, 3.0f)
                curveToRelative(1.106f, 0.0f, 2.077f, 0.605f, 2.592f, 1.5f)
                curveToRelative(0.258f, 0.44f, 0.408f, 0.952f, 0.408f, 1.5f)
                close()
            }
        }
        .build()
        return _addydotio!!
    }

private var _addydotio: ImageVector? = null
