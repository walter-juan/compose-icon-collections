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

public val LogosGroup.RemixRunFill: ImageVector
    get() {
        if (_remixRunFill != null) {
            return _remixRunFill!!
        }
        _remixRunFill = Builder(name = "RemixRunFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF121212)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.115f, 20.0f)
                curveTo(19.115f, 18.936f, 19.115f, 17.961f, 18.954f, 15.881f)
                curveTo(18.753f, 13.792f, 17.665f, 12.733f, 15.805f, 12.361f)
                curveTo(18.009f, 12.075f, 19.641f, 10.357f, 19.641f, 7.724f)
                curveTo(19.641f, 4.204f, 17.322f, 2.0f, 12.656f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.669f)
                horizontalLineTo(11.797f)
                curveTo(13.858f, 5.669f, 14.889f, 6.553f, 14.889f, 8.013f)
                curveTo(14.889f, 9.673f, 13.858f, 10.3f, 11.797f, 10.3f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.05f)
                horizontalLineTo(11.568f)
                curveTo(13.2f, 14.05f, 14.087f, 14.507f, 14.23f, 16.568f)
                curveTo(14.339f, 17.976f, 14.325f, 18.673f, 14.312f, 19.341f)
                lineTo(14.312f, 19.344f)
                curveTo(14.308f, 19.558f, 14.304f, 19.769f, 14.304f, 20.0f)
                lineTo(19.115f, 20.0f)
                close()
                moveTo(4.0f, 17.205f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.122f)
                verticalLineTo(18.211f)
                curveTo(10.122f, 17.835f, 9.938f, 17.205f, 9.088f, 17.205f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _remixRunFill!!
    }

private var _remixRunFill: ImageVector? = null
