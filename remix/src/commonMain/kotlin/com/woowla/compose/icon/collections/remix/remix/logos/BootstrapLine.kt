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

public val LogosGroup.BootstrapLine: ImageVector
    get() {
        if (_bootstrapLine != null) {
            return _bootstrapLine!!
        }
        _bootstrapLine = Builder(name = "BootstrapLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                lineTo(1.0f, 13.0f)
                curveTo(1.0f, 13.0f, 3.0f, 13.0f, 3.0f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 13.0f, 23.0f, 13.0f, 23.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 11.0f, 21.0f, 11.0f, 21.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.343f, 19.657f, 3.0f, 18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 11.0f, 1.0f, 11.0f, 1.0f, 11.0f)
                close()
                moveTo(20.674f, 12.0f)
                curveTo(20.645f, 12.028f, 20.615f, 12.056f, 20.586f, 12.086f)
                curveTo(19.578f, 13.093f, 19.0f, 14.692f, 19.0f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.552f, 18.552f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 14.692f, 4.422f, 13.093f, 3.414f, 12.086f)
                curveTo(3.385f, 12.056f, 3.355f, 12.028f, 3.326f, 12.0f)
                curveTo(3.355f, 11.972f, 3.385f, 11.944f, 3.414f, 11.914f)
                curveTo(4.422f, 10.907f, 5.0f, 9.308f, 5.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.448f, 5.448f, 5.0f, 6.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 9.308f, 19.578f, 10.907f, 20.586f, 11.914f)
                curveTo(20.615f, 11.944f, 20.645f, 11.972f, 20.674f, 12.0f)
                close()
                moveTo(8.5f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                curveTo(15.157f, 17.0f, 16.5f, 15.657f, 16.5f, 14.0f)
                curveTo(16.5f, 12.938f, 15.948f, 12.004f, 15.115f, 11.471f)
                curveTo(15.36f, 11.037f, 15.5f, 10.535f, 15.5f, 10.0f)
                curveTo(15.5f, 8.343f, 14.157f, 7.0f, 12.5f, 7.0f)
                lineTo(8.5f, 7.0f)
                close()
                moveTo(10.5f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.5f)
                curveTo(13.052f, 9.0f, 13.5f, 9.448f, 13.5f, 10.0f)
                curveTo(13.5f, 10.552f, 13.052f, 11.0f, 12.5f, 11.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 13.0f)
                horizontalLineTo(13.5f)
                curveTo(14.052f, 13.0f, 14.5f, 13.448f, 14.5f, 14.0f)
                curveTo(14.5f, 14.552f, 14.052f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bootstrapLine!!
    }

private var _bootstrapLine: ImageVector? = null
