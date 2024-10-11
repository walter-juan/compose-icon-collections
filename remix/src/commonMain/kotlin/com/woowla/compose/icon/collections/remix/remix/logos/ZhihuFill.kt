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

public val LogosGroup.ZhihuFill: ImageVector
    get() {
        if (_zhihuFill != null) {
            return _zhihuFill!!
        }
        _zhihuFill = Builder(name = "ZhihuFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.373f, 18.896f)
                lineTo(14.826f, 18.897f)
                lineTo(15.304f, 20.534f)
                lineTo(17.909f, 18.897f)
                horizontalLineTo(20.979f)
                verticalLineTo(5.395f)
                horizontalLineTo(13.373f)
                verticalLineTo(18.896f)
                close()
                moveTo(14.919f, 6.86f)
                horizontalLineTo(19.434f)
                verticalLineTo(17.431f)
                horizontalLineTo(17.702f)
                lineTo(15.972f, 18.518f)
                lineTo(15.657f, 17.434f)
                lineTo(14.919f, 17.431f)
                verticalLineTo(6.861f)
                lineTo(14.919f, 6.86f)
                close()
                moveTo(12.09f, 11.573f)
                horizontalLineTo(8.846f)
                curveTo(8.954f, 9.891f, 8.982f, 8.371f, 8.982f, 7.013f)
                horizontalLineTo(12.154f)
                curveTo(12.154f, 7.013f, 12.276f, 5.613f, 11.622f, 5.629f)
                horizontalLineTo(6.135f)
                curveTo(6.352f, 4.815f, 6.623f, 3.974f, 6.949f, 3.105f)
                curveTo(6.949f, 3.105f, 5.456f, 3.105f, 4.948f, 4.444f)
                curveTo(4.738f, 4.996f, 4.129f, 7.121f, 3.045f, 9.292f)
                curveTo(3.41f, 9.252f, 4.618f, 9.219f, 5.329f, 7.914f)
                curveTo(5.46f, 7.548f, 5.485f, 7.5f, 5.647f, 7.012f)
                horizontalLineTo(7.437f)
                curveTo(7.437f, 7.663f, 7.363f, 11.163f, 7.332f, 11.57f)
                horizontalLineTo(4.092f)
                curveTo(3.364f, 11.57f, 3.128f, 13.036f, 3.128f, 13.036f)
                horizontalLineTo(7.193f)
                curveTo(6.921f, 16.131f, 5.456f, 18.739f, 2.801f, 20.8f)
                curveTo(4.071f, 21.163f, 5.337f, 20.743f, 5.963f, 20.186f)
                curveTo(5.963f, 20.186f, 7.388f, 18.889f, 8.169f, 15.888f)
                lineTo(11.514f, 19.918f)
                curveTo(11.514f, 19.918f, 12.005f, 18.25f, 11.438f, 17.437f)
                curveTo(10.967f, 16.883f, 9.698f, 15.385f, 9.157f, 14.842f)
                lineTo(8.25f, 15.562f)
                curveTo(8.52f, 14.694f, 8.683f, 13.852f, 8.738f, 13.038f)
                horizontalLineTo(12.56f)
                curveTo(12.56f, 13.038f, 12.555f, 11.572f, 12.09f, 11.572f)
                verticalLineTo(11.573f)
                close()
            }
        }
        .build()
        return _zhihuFill!!
    }

private var _zhihuFill: ImageVector? = null
