package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.CodeLine: ImageVector
    get() {
        if (_codeLine != null) {
            return _codeLine!!
        }
        _codeLine = Builder(name = "CodeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(15.929f, 19.071f)
                lineTo(14.515f, 17.657f)
                lineTo(20.172f, 12.0f)
                lineTo(14.515f, 6.343f)
                lineTo(15.929f, 4.929f)
                lineTo(23.0f, 12.0f)
                close()
                moveTo(3.828f, 12.0f)
                lineTo(9.485f, 17.657f)
                lineTo(8.071f, 19.071f)
                lineTo(1.0f, 12.0f)
                lineTo(8.071f, 4.929f)
                lineTo(9.485f, 6.343f)
                lineTo(3.828f, 12.0f)
                close()
            }
        }
        .build()
        return _codeLine!!
    }

private var _codeLine: ImageVector? = null
