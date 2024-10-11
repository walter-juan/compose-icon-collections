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

public val LogosGroup.FinderFill: ImageVector
    get() {
        if (_finderFill != null) {
            return _finderFill!!
        }
        _finderFill = Builder(name = "FinderFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.001f, 3.0f)
                curveTo(21.553f, 3.0f, 22.001f, 3.448f, 22.001f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.001f, 20.552f, 21.553f, 21.0f, 21.001f, 21.0f)
                horizontalLineTo(3.001f)
                curveTo(2.449f, 21.0f, 2.001f, 20.552f, 2.001f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.001f, 3.448f, 2.449f, 3.0f, 3.001f, 3.0f)
                horizontalLineTo(21.001f)
                close()
                moveTo(20.001f, 5.0f)
                horizontalLineTo(11.536f)
                curveTo(10.846f, 6.977f, 10.501f, 9.644f, 10.501f, 13.0f)
                horizontalLineTo(13.501f)
                curveTo(13.386f, 13.919f, 13.35f, 14.878f, 13.394f, 15.877f)
                curveTo(14.62f, 15.666f, 16.098f, 15.1f, 17.421f, 14.168f)
                lineTo(18.556f, 15.832f)
                curveTo(16.914f, 16.927f, 15.253f, 17.611f, 13.58f, 17.875f)
                curveTo(13.632f, 18.245f, 13.693f, 18.62f, 13.764f, 19.0f)
                lineTo(20.001f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.556f, 14.168f)
                lineTo(5.446f, 15.832f)
                curveTo(7.603f, 17.27f, 9.793f, 18.0f, 12.001f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(10.209f, 16.0f, 8.399f, 15.397f, 6.556f, 14.168f)
                close()
                moveTo(17.001f, 7.0f)
                curveTo(17.553f, 7.0f, 18.001f, 7.448f, 18.001f, 8.0f)
                verticalLineTo(9.0f)
                curveTo(18.001f, 9.552f, 17.553f, 10.0f, 17.001f, 10.0f)
                curveTo(16.449f, 10.0f, 16.001f, 9.552f, 16.001f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(16.001f, 7.448f, 16.449f, 7.0f, 17.001f, 7.0f)
                close()
                moveTo(7.001f, 7.0f)
                curveTo(6.449f, 7.0f, 6.001f, 7.452f, 6.001f, 8.0f)
                curveTo(6.001f, 8.366f, 6.001f, 8.699f, 6.001f, 9.0f)
                curveTo(6.001f, 9.552f, 6.449f, 10.0f, 7.001f, 10.0f)
                curveTo(7.553f, 10.0f, 8.001f, 9.55f, 8.001f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(8.001f, 7.448f, 7.553f, 7.0f, 7.001f, 7.0f)
                close()
            }
        }
        .build()
        return _finderFill!!
    }

private var _finderFill: ImageVector? = null
