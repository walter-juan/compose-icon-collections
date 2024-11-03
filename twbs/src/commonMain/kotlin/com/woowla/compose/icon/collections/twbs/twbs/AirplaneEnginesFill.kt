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

public val Twbs.AirplaneEnginesFill: ImageVector
    get() {
        if (_airplaneEnginesFill != null) {
            return _airplaneEnginesFill!!
        }
        _airplaneEnginesFill = Builder(name = "AirplaneEnginesFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                curveToRelative(-0.787f, 0.0f, -1.292f, 0.592f, -1.572f, 1.151f)
                arcTo(4.35f, 4.35f, 0.0f, false, false, 6.0f, 3.0f)
                verticalLineToRelative(3.691f)
                lineToRelative(-2.0f, 1.0f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.191f)
                lineToRelative(-1.17f, 0.585f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 10.618f)
                verticalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.582f, 0.493f)
                lineToRelative(1.631f, -0.272f)
                lineToRelative(0.313f, 0.937f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.948f, 0.0f)
                lineToRelative(0.405f, -1.214f)
                lineToRelative(2.21f, -0.369f)
                lineToRelative(0.375f, 2.253f)
                lineToRelative(-1.318f, 1.318f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.354f, -0.854f)
                lineToRelative(-1.318f, -1.318f)
                lineToRelative(0.375f, -2.253f)
                lineToRelative(2.21f, 0.369f)
                lineToRelative(0.405f, 1.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.948f, 0.0f)
                lineToRelative(0.313f, -0.937f)
                lineToRelative(1.63f, 0.272f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 12.0f)
                verticalLineToRelative(-1.382f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.83f, -1.342f)
                lineTo(14.0f, 8.691f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.191f)
                lineToRelative(-2.0f, -1.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.568f, -0.14f, -1.271f, -0.428f, -1.849f)
                curveTo(9.292f, 0.591f, 8.787f, 0.0f, 8.0f, 0.0f)
            }
        }
        .build()
        return _airplaneEnginesFill!!
    }

private var _airplaneEnginesFill: ImageVector? = null
