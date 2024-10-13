package com.woowla.compose.icon.collections.devicons.devicons.nextjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NextjsGroup

public val NextjsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 35.51f, -10.84f)
                lineTo(47.01f, 49.34f)
                verticalLineToRelative(40.24f)
                lineTo(38.4f, 89.58f)
                lineTo(38.4f, 38.4f)
                horizontalLineToRelative(10.77f)
                lineToRelative(57.13f, 73.58f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 128.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 0.0f)
                close()
                moveTo(81.78f, 38.4f)
                horizontalLineToRelative(8.53f)
                verticalLineToRelative(48.78f)
                lineTo(81.78f, 75.97f)
                close()
                moveTo(105.96f, 112.32f)
                lineTo(105.85f, 112.42f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.11f, -0.1f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
