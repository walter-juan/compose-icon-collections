package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ClipboardDocumentCheck: ImageVector
    get() {
        if (_clipboardDocumentCheck != null) {
            return _clipboardDocumentCheck!!
        }
        _clipboardDocumentCheck = Builder(name = "ClipboardDocumentCheck", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.349f, 3.836f)
                curveTo(11.285f, 4.046f, 11.25f, 4.269f, 11.25f, 4.5f)
                curveTo(11.25f, 4.914f, 11.586f, 5.25f, 12.0f, 5.25f)
                horizontalLineTo(16.5f)
                curveTo(16.914f, 5.25f, 17.25f, 4.914f, 17.25f, 4.5f)
                curveTo(17.25f, 4.269f, 17.215f, 4.046f, 17.15f, 3.836f)
                moveTo(11.349f, 3.836f)
                curveTo(11.633f, 2.918f, 12.488f, 2.25f, 13.5f, 2.25f)
                horizontalLineTo(15.0f)
                curveTo(16.012f, 2.25f, 16.867f, 2.918f, 17.15f, 3.836f)
                moveTo(11.349f, 3.836f)
                curveTo(10.974f, 3.859f, 10.599f, 3.885f, 10.226f, 3.916f)
                curveTo(9.095f, 4.01f, 8.25f, 4.973f, 8.25f, 6.108f)
                verticalLineTo(8.25f)
                moveTo(17.15f, 3.836f)
                curveTo(17.526f, 3.859f, 17.901f, 3.885f, 18.274f, 3.916f)
                curveTo(19.405f, 4.01f, 20.25f, 4.973f, 20.25f, 6.108f)
                verticalLineTo(16.5f)
                curveTo(20.25f, 17.743f, 19.243f, 18.75f, 18.0f, 18.75f)
                horizontalLineTo(15.75f)
                moveTo(8.25f, 8.25f)
                horizontalLineTo(4.875f)
                curveTo(4.254f, 8.25f, 3.75f, 8.754f, 3.75f, 9.375f)
                verticalLineTo(20.625f)
                curveTo(3.75f, 21.246f, 4.254f, 21.75f, 4.875f, 21.75f)
                horizontalLineTo(14.625f)
                curveTo(15.246f, 21.75f, 15.75f, 21.246f, 15.75f, 20.625f)
                verticalLineTo(18.75f)
                moveTo(8.25f, 8.25f)
                horizontalLineTo(14.625f)
                curveTo(15.246f, 8.25f, 15.75f, 8.754f, 15.75f, 9.375f)
                verticalLineTo(18.75f)
                moveTo(7.5f, 15.75f)
                lineTo(9.0f, 17.25f)
                lineTo(12.0f, 13.5f)
            }
        }
        .build()
        return _clipboardDocumentCheck!!
    }

private var _clipboardDocumentCheck: ImageVector? = null
