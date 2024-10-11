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

public val OthersGroup.PoliceBadgeLine: ImageVector
    get() {
        if (_policeBadgeLine != null) {
            return _policeBadgeLine!!
        }
        _policeBadgeLine = Builder(name = "PoliceBadgeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.475f, 4.935f)
                curveTo(16.98f, 4.91f, 17.437f, 4.845f, 17.826f, 4.767f)
                lineTo(19.558f, 6.747f)
                curveTo(19.168f, 7.566f, 18.946f, 8.349f, 18.863f, 9.124f)
                curveTo(18.739f, 10.281f, 18.952f, 11.267f, 19.108f, 11.987f)
                lineTo(19.115f, 12.02f)
                curveTo(19.277f, 12.764f, 19.383f, 13.254f, 19.368f, 13.829f)
                curveTo(19.353f, 14.37f, 19.221f, 15.085f, 18.711f, 16.106f)
                curveTo(17.611f, 18.307f, 15.016f, 18.772f, 12.996f, 19.781f)
                curveTo(12.67f, 19.945f, 12.333f, 20.131f, 12.0f, 20.35f)
                curveTo(11.667f, 20.131f, 11.33f, 19.944f, 11.004f, 19.781f)
                curveTo(8.984f, 18.772f, 6.39f, 18.307f, 5.289f, 16.105f)
                curveTo(4.779f, 15.085f, 4.647f, 14.37f, 4.632f, 13.829f)
                curveTo(4.616f, 13.253f, 4.723f, 12.764f, 4.885f, 12.02f)
                lineTo(4.892f, 11.987f)
                curveTo(5.048f, 11.268f, 5.261f, 10.281f, 5.137f, 9.124f)
                curveTo(5.054f, 8.349f, 4.832f, 7.566f, 4.442f, 6.747f)
                lineTo(6.174f, 4.767f)
                curveTo(6.563f, 4.845f, 7.02f, 4.91f, 7.525f, 4.935f)
                curveTo(8.79f, 4.998f, 10.402f, 4.81f, 12.0f, 3.918f)
                curveTo(13.598f, 4.81f, 15.21f, 4.998f, 16.475f, 4.935f)
                close()
                moveTo(21.087f, 11.674f)
                curveTo(20.764f, 10.195f, 20.461f, 8.808f, 22.0f, 6.5f)
                lineTo(18.5f, 2.5f)
                curveTo(18.5f, 2.5f, 15.0f, 4.0f, 12.0f, 1.5f)
                curveTo(9.0f, 4.0f, 5.5f, 2.5f, 5.5f, 2.5f)
                lineTo(2.0f, 6.5f)
                curveTo(3.539f, 8.808f, 3.236f, 10.195f, 2.913f, 11.674f)
                curveTo(2.607f, 13.078f, 2.282f, 14.564f, 3.5f, 17.0f)
                curveTo(5.077f, 20.154f, 8.208f, 20.51f, 10.443f, 21.745f)
                curveTo(11.042f, 22.077f, 11.577f, 22.471f, 12.0f, 23.0f)
                curveTo(12.423f, 22.471f, 12.958f, 22.077f, 13.558f, 21.745f)
                curveTo(15.792f, 20.51f, 18.923f, 20.154f, 20.5f, 17.0f)
                curveTo(21.718f, 14.564f, 21.393f, 13.078f, 21.087f, 11.674f)
                close()
                moveTo(14.378f, 12.773f)
                lineTo(14.939f, 16.045f)
                lineTo(12.0f, 14.5f)
                lineTo(9.061f, 16.045f)
                lineTo(9.622f, 12.773f)
                lineTo(7.245f, 10.455f)
                lineTo(10.53f, 9.977f)
                lineTo(12.0f, 7.0f)
                lineTo(13.469f, 9.977f)
                lineTo(16.755f, 10.455f)
                lineTo(14.378f, 12.773f)
                close()
            }
        }
        .build()
        return _policeBadgeLine!!
    }

private var _policeBadgeLine: ImageVector? = null
