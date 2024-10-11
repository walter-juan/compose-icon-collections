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

public val OthersGroup.TreeFill: ImageVector
    get() {
        if (_treeFill != null) {
            return _treeFill!!
        }
        _treeFill = Builder(name = "TreeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveTo(18.0f, 7.262f, 17.983f, 7.521f, 17.951f, 7.774f)
                curveTo(19.771f, 8.805f, 21.0f, 10.759f, 21.0f, 13.0f)
                curveTo(21.0f, 16.314f, 18.314f, 19.0f, 15.0f, 19.0f)
                curveTo(14.299f, 19.0f, 13.626f, 18.88f, 13.0f, 18.659f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.4f)
                curveTo(10.25f, 18.784f, 9.4f, 19.0f, 8.5f, 19.0f)
                curveTo(5.462f, 19.0f, 3.0f, 16.538f, 3.0f, 13.5f)
                curveTo(3.0f, 12.047f, 3.563f, 10.726f, 4.483f, 9.743f)
                curveTo(4.877f, 10.823f, 5.497f, 11.794f, 6.286f, 12.599f)
                lineTo(7.714f, 11.199f)
                curveTo(6.991f, 10.461f, 6.457f, 9.538f, 6.191f, 8.507f)
                curveTo(6.066f, 8.025f, 6.0f, 7.52f, 6.0f, 7.0f)
                curveTo(6.0f, 3.686f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 3.686f, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _treeFill!!
    }

private var _treeFill: ImageVector? = null
