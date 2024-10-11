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

public val DevelopmentGroup.CodeSFill: ImageVector
    get() {
        if (_codeSFill != null) {
            return _codeSFill!!
        }
        _codeSFill = Builder(name = "CodeSFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineTo(18.343f, 17.657f)
                lineTo(16.929f, 16.243f)
                lineTo(21.172f, 12.0f)
                lineTo(16.929f, 7.757f)
                lineTo(18.343f, 6.343f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(2.828f, 12.0f)
                lineTo(7.071f, 16.243f)
                lineTo(5.657f, 17.657f)
                lineTo(0.0f, 12.0f)
                lineTo(5.657f, 6.343f)
                lineTo(7.071f, 7.757f)
                lineTo(2.828f, 12.0f)
                close()
            }
        }
        .build()
        return _codeSFill!!
    }

private var _codeSFill: ImageVector? = null
