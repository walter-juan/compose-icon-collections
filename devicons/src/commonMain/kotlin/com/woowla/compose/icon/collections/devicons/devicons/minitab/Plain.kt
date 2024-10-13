package com.woowla.compose.icon.collections.devicons.devicons.minitab

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MinitabGroup

public val MinitabGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF8DC63F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(34.6f, 106.5f)
                lineTo(14.8f, 106.5f)
                verticalLineToRelative(-54.0f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(54.0f)
                close()
                moveTo(61.7f, 106.5f)
                lineTo(42.0f, 106.5f)
                verticalLineToRelative(-87.0f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(87.0f)
                close()
                moveTo(88.8f, 106.5f)
                lineTo(69.1f, 106.5f)
                lineTo(69.1f, 37.6f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(68.9f)
                close()
                moveTo(116.0f, 106.5f)
                lineTo(96.3f, 106.5f)
                lineTo(96.3f, 68.6f)
                lineTo(116.0f, 68.6f)
                verticalLineToRelative(37.9f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
