package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Opnsense: ImageVector
    get() {
        if (_opnsense != null) {
            return _opnsense!!
        }
        _opnsense = Builder(name = "Opnsense", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 0.0f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(13.5f)
                lineTo(24.0f, 18.75f)
                lineTo(24.0f, 7.5f)
                lineTo(16.5f, 0.0f)
                close()
                moveTo(18.75f, 18.75f)
                lineTo(5.25f, 18.75f)
                lineTo(5.25f, 5.25f)
                lineTo(0.0f, 5.25f)
                lineTo(0.0f, 16.5f)
                lineTo(7.5f, 24.0f)
                horizontalLineToRelative(11.25f)
                close()
            }
        }
        .build()
        return _opnsense!!
    }

private var _opnsense: ImageVector? = null
