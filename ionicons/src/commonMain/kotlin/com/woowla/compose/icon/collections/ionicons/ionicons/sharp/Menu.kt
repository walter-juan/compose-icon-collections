package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 384.0f)
                lineTo(448.0f, 384.0f)
                lineTo(448.0f, 341.33f)
                lineTo(64.0f, 341.33f)
                close()
                moveTo(64.0f, 277.33f)
                lineTo(448.0f, 277.33f)
                lineTo(448.0f, 234.67f)
                lineTo(64.0f, 234.67f)
                close()
                moveTo(64.0f, 128.0f)
                verticalLineToRelative(42.67f)
                lineTo(448.0f, 170.67f)
                lineTo(448.0f, 128.0f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
