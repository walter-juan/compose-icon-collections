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

public val OthersGroup.FlowerFill: ImageVector
    get() {
        if (_flowerFill != null) {
            return _flowerFill!!
        }
        _flowerFill = Builder(name = "FlowerFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.455f, 2.309f)
                lineTo(12.0f, 2.076f)
                lineTo(11.545f, 2.309f)
                curveTo(10.395f, 2.896f, 9.353f, 3.664f, 8.456f, 4.574f)
                curveTo(9.774f, 5.26f, 10.969f, 6.15f, 12.0f, 7.202f)
                curveTo(13.031f, 6.15f, 14.226f, 5.26f, 15.544f, 4.574f)
                curveTo(14.647f, 3.664f, 13.604f, 2.897f, 12.455f, 2.309f)
                close()
                moveTo(10.699f, 8.734f)
                curveTo(8.989f, 6.935f, 6.726f, 5.665f, 4.181f, 5.198f)
                lineTo(3.0f, 4.981f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 16.805f, 5.361f, 20.058f, 8.697f, 21.375f)
                curveTo(8.245f, 19.998f, 8.0f, 18.528f, 8.0f, 17.0f)
                curveTo(8.0f, 13.908f, 9.002f, 11.051f, 10.699f, 8.734f)
                close()
                moveTo(21.0f, 4.981f)
                lineTo(19.819f, 5.198f)
                curveTo(14.233f, 6.224f, 10.0f, 11.117f, 10.0f, 17.0f)
                curveTo(10.0f, 18.536f, 10.289f, 20.007f, 10.817f, 21.36f)
                lineTo(11.057f, 21.975f)
                curveTo(11.371f, 21.985f, 11.686f, 22.0f, 12.0f, 22.0f)
                curveTo(16.971f, 22.0f, 21.0f, 17.971f, 21.0f, 13.0f)
                verticalLineTo(4.981f)
                close()
            }
        }
        .build()
        return _flowerFill!!
    }

private var _flowerFill: ImageVector? = null
