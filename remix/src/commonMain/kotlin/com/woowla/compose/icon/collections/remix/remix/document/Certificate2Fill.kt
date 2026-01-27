package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.Certificate2Fill: ImageVector
    get() {
        if (_certificate2Fill != null) {
            return _certificate2Fill!!
        }
        _certificate2Fill = Builder(name = "Certificate2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(21.209f, 12.0f, 23.0f, 13.791f, 23.0f, 16.0f)
                curveTo(23.0f, 17.263f, 22.414f, 18.388f, 21.5f, 19.121f)
                verticalLineTo(23.5f)
                lineTo(19.0f, 22.0f)
                lineTo(16.5f, 23.5f)
                verticalLineTo(19.121f)
                curveTo(15.586f, 18.388f, 15.0f, 17.263f, 15.0f, 16.0f)
                curveTo(15.0f, 14.378f, 15.966f, 12.982f, 17.354f, 12.354f)
                curveTo(17.36f, 12.352f, 17.365f, 12.349f, 17.37f, 12.347f)
                curveTo(17.464f, 12.305f, 17.56f, 12.266f, 17.658f, 12.231f)
                curveTo(17.667f, 12.228f, 17.676f, 12.225f, 17.685f, 12.222f)
                curveTo(17.882f, 12.153f, 18.085f, 12.1f, 18.294f, 12.063f)
                curveTo(18.306f, 12.06f, 18.319f, 12.058f, 18.331f, 12.056f)
                curveTo(18.43f, 12.039f, 18.531f, 12.026f, 18.633f, 12.017f)
                curveTo(18.65f, 12.015f, 18.667f, 12.014f, 18.684f, 12.013f)
                curveTo(18.788f, 12.005f, 18.893f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(20.0f, 2.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(10.342f)
                curveTo(20.374f, 10.121f, 19.701f, 10.0f, 19.0f, 10.0f)
                curveTo(17.907f, 10.0f, 16.883f, 10.293f, 16.0f, 10.804f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.684f)
                curveTo(14.066f, 12.075f, 13.0f, 13.913f, 13.0f, 16.0f)
                curveTo(13.0f, 17.777f, 13.773f, 19.372f, 15.0f, 20.471f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(17.895f, 14.0f, 17.0f, 14.895f, 17.0f, 16.0f)
                curveTo(17.0f, 17.105f, 17.895f, 18.0f, 19.0f, 18.0f)
                curveTo(20.105f, 18.0f, 21.0f, 17.105f, 21.0f, 16.0f)
                curveTo(21.0f, 14.895f, 20.105f, 14.0f, 19.0f, 14.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _certificate2Fill!!
    }

private var _certificate2Fill: ImageVector? = null
