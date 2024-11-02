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

public val OutlineGroup.ClipboardDocument: ImageVector
    get() {
        if (_clipboardDocument != null) {
            return _clipboardDocument!!
        }
        _clipboardDocument = Builder(name = "ClipboardDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 7.5f)
                verticalLineTo(6.108f)
                curveTo(8.25f, 4.973f, 9.095f, 4.01f, 10.226f, 3.916f)
                curveTo(10.599f, 3.885f, 10.974f, 3.859f, 11.349f, 3.836f)
                moveTo(15.75f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.243f, 18.0f, 20.25f, 16.993f, 20.25f, 15.75f)
                verticalLineTo(6.108f)
                curveTo(20.25f, 4.973f, 19.405f, 4.01f, 18.274f, 3.916f)
                curveTo(17.901f, 3.885f, 17.526f, 3.859f, 17.15f, 3.836f)
                moveTo(15.75f, 18.75f)
                verticalLineTo(16.875f)
                curveTo(15.75f, 15.011f, 14.239f, 13.5f, 12.375f, 13.5f)
                horizontalLineTo(10.875f)
                curveTo(10.254f, 13.5f, 9.75f, 12.996f, 9.75f, 12.375f)
                verticalLineTo(10.875f)
                curveTo(9.75f, 9.011f, 8.239f, 7.5f, 6.375f, 7.5f)
                horizontalLineTo(5.25f)
                moveTo(17.15f, 3.836f)
                curveTo(16.867f, 2.918f, 16.012f, 2.25f, 15.0f, 2.25f)
                horizontalLineTo(13.5f)
                curveTo(12.488f, 2.25f, 11.633f, 2.918f, 11.349f, 3.836f)
                moveTo(17.15f, 3.836f)
                curveTo(17.215f, 4.046f, 17.25f, 4.269f, 17.25f, 4.5f)
                verticalLineTo(5.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.5f)
                curveTo(11.25f, 4.269f, 11.285f, 4.046f, 11.349f, 3.836f)
                moveTo(6.75f, 7.5f)
                horizontalLineTo(4.875f)
                curveTo(4.254f, 7.5f, 3.75f, 8.004f, 3.75f, 8.625f)
                verticalLineTo(20.625f)
                curveTo(3.75f, 21.246f, 4.254f, 21.75f, 4.875f, 21.75f)
                horizontalLineTo(14.625f)
                curveTo(15.246f, 21.75f, 15.75f, 21.246f, 15.75f, 20.625f)
                verticalLineTo(16.5f)
                curveTo(15.75f, 11.529f, 11.721f, 7.5f, 6.75f, 7.5f)
                close()
            }
        }
        .build()
        return _clipboardDocument!!
    }

private var _clipboardDocument: ImageVector? = null
