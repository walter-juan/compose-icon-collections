package com.woowla.compose.icon.collections.devicons.devicons.materialui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MaterialuiGroup

public val MaterialuiGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1FA6CA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2f, 68.6f)
                verticalLineTo(13.4f)
                lineTo(48.0f, 41.0f)
                verticalLineToRelative(18.4f)
                lineTo(16.1f, 41.0f)
                verticalLineToRelative(36.8f)
                lineTo(0.2f, 68.6f)
                close()
                moveTo(48.0f, 41.0f)
                lineToRelative(47.9f, -27.6f)
                verticalLineToRelative(55.3f)
                lineTo(64.0f, 87.0f)
                lineToRelative(-16.0f, -9.2f)
                lineToRelative(32.0f, -18.4f)
                verticalLineTo(41.0f)
                lineTo(48.0f, 59.4f)
                verticalLineTo(41.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1FA6CA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 77.8f)
                verticalLineToRelative(18.4f)
                lineToRelative(32.0f, 18.4f)
                verticalLineTo(96.2f)
                lineTo(48.0f, 77.8f)
                close()
                moveTo(80.0f, 114.6f)
                lineTo(127.8f, 87.0f)
                verticalLineTo(50.2f)
                lineToRelative(-16.0f, 9.2f)
                verticalLineToRelative(18.4f)
                lineTo(80.0f, 96.2f)
                verticalLineToRelative(18.4f)
                close()
                moveTo(111.9f, 41.0f)
                verticalLineTo(22.6f)
                lineToRelative(16.0f, -9.2f)
                verticalLineToRelative(18.4f)
                lineToRelative(-16.0f, 9.2f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
