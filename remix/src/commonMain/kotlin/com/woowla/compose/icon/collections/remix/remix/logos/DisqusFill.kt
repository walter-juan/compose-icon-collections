package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.DisqusFill: ImageVector
    get() {
        if (_disqusFill != null) {
            return _disqusFill!!
        }
        _disqusFill = Builder(name = "DisqusFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(9.47f, 22.0f, 7.16f, 21.061f, 5.399f, 19.512f)
                lineTo(1.5f, 20.0f)
                lineTo(2.924f, 16.203f)
                curveTo(2.331f, 14.925f, 2.0f, 13.501f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.733f)
                lineTo(11.996f, 16.996f)
                curveTo(15.371f, 16.893f, 17.333f, 14.785f, 17.333f, 11.971f)
                verticalLineTo(11.944f)
                lineTo(17.33f, 11.729f)
                curveTo(17.231f, 8.956f, 15.211f, 7.0f, 11.79f, 7.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(11.831f, 9.458f)
                curveTo(13.459f, 9.458f, 14.54f, 10.386f, 14.54f, 11.987f)
                verticalLineTo(12.015f)
                lineTo(14.535f, 12.198f)
                curveTo(14.456f, 13.698f, 13.397f, 14.543f, 11.831f, 14.543f)
                horizontalLineTo(10.723f)
                verticalLineTo(9.458f)
                horizontalLineTo(11.831f)
                close()
            }
        }
        .build()
        return _disqusFill!!
    }

private var _disqusFill: ImageVector? = null
