package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BasketballLine: ImageVector
    get() {
        if (_basketballLine != null) {
            return _basketballLine!!
        }
        _basketballLine = Builder(name = "BasketballLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.366f, 13.366f)
                lineTo(8.897f, 19.376f)
                curveTo(9.851f, 19.778f, 10.9f, 20.0f, 12.0f, 20.0f)
                curveTo(12.462f, 20.0f, 12.915f, 19.961f, 13.356f, 19.886f)
                curveTo(13.098f, 18.063f, 13.341f, 16.16f, 14.14f, 14.392f)
                lineTo(12.366f, 13.366f)
                close()
                moveTo(15.884f, 15.397f)
                curveTo(15.352f, 16.657f, 15.167f, 17.994f, 15.297f, 19.291f)
                curveTo(16.517f, 18.738f, 17.574f, 17.889f, 18.375f, 16.835f)
                lineTo(15.884f, 15.397f)
                close()
                moveTo(8.859f, 11.342f)
                curveTo(7.727f, 12.919f, 6.199f, 14.081f, 4.494f, 14.77f)
                curveTo(5.025f, 16.213f, 5.962f, 17.46f, 7.165f, 18.375f)
                lineTo(10.634f, 12.366f)
                lineTo(8.859f, 11.342f)
                close()
                moveTo(19.962f, 11.211f)
                lineTo(19.704f, 11.333f)
                curveTo(18.62f, 11.869f, 17.648f, 12.655f, 16.883f, 13.665f)
                lineTo(19.376f, 15.104f)
                curveTo(19.778f, 14.149f, 20.0f, 13.101f, 20.0f, 12.0f)
                curveTo(20.0f, 11.734f, 19.987f, 11.471f, 19.962f, 11.211f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 12.266f, 4.013f, 12.529f, 4.038f, 12.789f)
                curveTo(5.226f, 12.253f, 6.292f, 11.425f, 7.116f, 10.335f)
                lineTo(4.624f, 8.897f)
                curveTo(4.222f, 9.851f, 4.0f, 10.9f, 4.0f, 12.0f)
                close()
                moveTo(16.835f, 5.626f)
                lineTo(13.366f, 11.634f)
                lineTo(15.141f, 12.659f)
                curveTo(16.273f, 11.081f, 17.801f, 9.919f, 19.507f, 9.23f)
                curveTo(19.013f, 7.891f, 18.17f, 6.719f, 17.088f, 5.827f)
                lineTo(16.835f, 5.626f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(11.538f, 4.0f, 11.084f, 4.039f, 10.643f, 4.115f)
                curveTo(10.902f, 5.937f, 10.659f, 7.841f, 9.859f, 9.609f)
                lineTo(11.634f, 10.634f)
                lineTo(15.103f, 4.624f)
                curveTo(14.149f, 4.222f, 13.1f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(8.703f, 4.71f)
                lineTo(8.512f, 4.798f)
                curveTo(7.373f, 5.351f, 6.384f, 6.166f, 5.626f, 7.165f)
                lineTo(8.116f, 8.603f)
                curveTo(8.648f, 7.344f, 8.833f, 6.006f, 8.703f, 4.71f)
                close()
            }
        }
        .build()
        return _basketballLine!!
    }

private var _basketballLine: ImageVector? = null
