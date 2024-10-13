package com.woowla.compose.icon.collections.devicons.devicons.azuredevops

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AzuredevopsGroup

public val AzuredevopsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0078d4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.89f, 28.44f)
                verticalLineToRelative(69.26f)
                lineToRelative(-28.44f, 23.32f)
                lineToRelative(-44.09f, -16.07f)
                verticalLineToRelative(15.93f)
                lineTo(23.4f, 88.25f)
                lineToRelative(72.75f, 5.69f)
                lineTo(96.14f, 31.57f)
                close()
                moveTo(96.64f, 31.93f)
                lineTo(55.82f, 7.11f)
                verticalLineToRelative(16.28f)
                lineTo(18.35f, 34.42f)
                lineTo(7.11f, 48.85f)
                verticalLineToRelative(32.78f)
                lineToRelative(16.08f, 7.11f)
                lineTo(23.18f, 46.72f)
                close()
                moveTo(96.64f, 31.93f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
