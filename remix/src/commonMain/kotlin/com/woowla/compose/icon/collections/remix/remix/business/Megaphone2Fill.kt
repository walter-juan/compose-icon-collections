package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.Megaphone2Fill: ImageVector
    get() {
        if (_megaphone2Fill != null) {
            return _megaphone2Fill!!
        }
        _megaphone2Fill = Builder(name = "Megaphone2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.31f, 20.095f)
                curveTo(12.416f, 21.16f, 11.664f, 22.119f, 10.604f, 22.271f)
                curveTo(9.669f, 22.404f, 8.769f, 21.864f, 8.446f, 20.976f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(12.0f)
                lineTo(12.31f, 20.095f)
                close()
                moveTo(19.445f, 2.037f)
                curveTo(20.11f, 1.594f, 21.0f, 2.07f, 21.0f, 2.869f)
                verticalLineTo(18.131f)
                curveTo(21.0f, 18.93f, 20.11f, 19.406f, 19.445f, 18.963f)
                lineTo(15.0f, 16.0f)
                horizontalLineTo(7.5f)
                curveTo(4.463f, 16.0f, 2.0f, 13.538f, 2.0f, 10.5f)
                curveTo(2.0f, 7.463f, 4.462f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(15.0f)
                lineTo(19.445f, 2.037f)
                close()
            }
        }
        .build()
        return _megaphone2Fill!!
    }

private var _megaphone2Fill: ImageVector? = null
