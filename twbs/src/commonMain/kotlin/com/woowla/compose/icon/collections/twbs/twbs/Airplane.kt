package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.428f, 1.151f)
                curveTo(6.708f, 0.591f, 7.213f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.292f, 0.592f, 1.572f, 1.151f)
                curveTo(9.861f, 1.73f, 10.0f, 2.431f, 10.0f, 3.0f)
                verticalLineToRelative(3.691f)
                lineToRelative(5.17f, 2.585f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, 1.342f)
                verticalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.582f, 0.493f)
                lineToRelative(-5.507f, -0.918f)
                lineToRelative(-0.375f, 2.253f)
                lineToRelative(1.318f, 1.318f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 16.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.319f, -1.318f)
                lineToRelative(-0.376f, -2.253f)
                lineToRelative(-5.507f, 0.918f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 12.0f)
                verticalLineToRelative(-1.382f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, -1.342f)
                lineTo(6.0f, 6.691f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.568f, 0.14f, -1.271f, 0.428f, -1.849f)
                moveToRelative(0.894f, 0.448f)
                curveTo(7.111f, 2.02f, 7.0f, 2.569f, 7.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.276f, 0.447f)
                lineToRelative(-5.448f, 2.724f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.276f, 0.447f)
                verticalLineToRelative(0.792f)
                lineToRelative(5.418f, -0.903f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.575f, 0.41f)
                lineToRelative(0.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.14f, 0.437f)
                lineTo(6.708f, 15.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.14f, -0.436f)
                lineToRelative(0.5f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.576f, -0.411f)
                lineTo(15.0f, 11.41f)
                verticalLineToRelative(-0.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.276f, -0.447f)
                lineTo(9.276f, 7.447f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 7.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.432f, -0.11f, -0.979f, -0.322f, -1.401f)
                curveTo(8.458f, 1.159f, 8.213f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveToRelative(-0.458f, 0.158f, -0.678f, 0.599f)
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
