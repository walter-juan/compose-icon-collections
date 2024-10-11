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

public val LogosGroup.FinderLine: ImageVector
    get() {
        if (_finderLine != null) {
            return _finderLine!!
        }
        _finderLine = Builder(name = "FinderLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.482f, 4.999f)
                lineTo(4.001f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(12.747f, 19.0f)
                curveTo(12.685f, 18.656f, 12.631f, 18.316f, 12.584f, 17.98f)
                curveTo(12.287f, 17.993f, 12.093f, 18.0f, 12.001f, 18.0f)
                curveTo(9.793f, 18.0f, 7.603f, 17.27f, 5.446f, 15.832f)
                lineTo(6.556f, 14.168f)
                curveTo(8.399f, 15.397f, 10.209f, 16.0f, 12.001f, 16.0f)
                curveTo(12.134f, 16.0f, 12.266f, 15.997f, 12.399f, 15.99f)
                curveTo(12.375f, 15.493f, 12.375f, 14.58f, 12.406f, 14.0f)
                horizontalLineTo(9.501f)
                verticalLineTo(13.0f)
                curveTo(9.501f, 9.725f, 9.821f, 7.061f, 10.482f, 4.999f)
                close()
                moveTo(12.601f, 4.999f)
                curveTo(11.936f, 6.582f, 11.557f, 9.411f, 11.512f, 12.0f)
                horizontalLineTo(14.634f)
                lineTo(14.493f, 13.124f)
                curveTo(14.393f, 13.929f, 14.357f, 14.769f, 14.386f, 15.644f)
                curveTo(15.399f, 15.345f, 16.417f, 14.854f, 17.446f, 14.168f)
                lineTo(18.556f, 15.832f)
                curveTo(17.236f, 16.712f, 15.904f, 17.327f, 14.563f, 17.671f)
                curveTo(14.62f, 18.105f, 14.694f, 18.548f, 14.782f, 18.999f)
                lineTo(20.001f, 19.0f)
                verticalLineTo(5.0f)
                lineTo(12.601f, 4.999f)
                close()
                moveTo(7.001f, 7.0f)
                curveTo(7.553f, 7.0f, 8.001f, 7.448f, 8.001f, 8.0f)
                verticalLineTo(9.0f)
                curveTo(8.001f, 9.552f, 7.553f, 10.0f, 7.001f, 10.0f)
                curveTo(6.449f, 10.0f, 6.001f, 9.552f, 6.001f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(6.001f, 7.448f, 6.449f, 7.0f, 7.001f, 7.0f)
                close()
                moveTo(17.001f, 7.0f)
                curveTo(17.553f, 7.0f, 18.001f, 7.448f, 18.001f, 8.0f)
                verticalLineTo(9.0f)
                curveTo(18.001f, 9.552f, 17.553f, 10.0f, 17.001f, 10.0f)
                curveTo(16.449f, 10.0f, 16.001f, 9.552f, 16.001f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(16.001f, 7.448f, 16.449f, 7.0f, 17.001f, 7.0f)
                close()
            }
        }
        .build()
        return _finderLine!!
    }

private var _finderLine: ImageVector? = null
