package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlTailwindCss: ImageVector
    get() {
        if (_bxlTailwindCss != null) {
            return _bxlTailwindCss!!
        }
        _bxlTailwindCss = Builder(name = "BxlTailwindCss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.51f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, -1.91f, -1.34f)
                arcTo(5.77f, 5.77f, 0.0f, false, false, 12.0f, 6.0f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, false, -5.0f, 4.0f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 3.5f, -1.49f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, true, 1.91f, 1.35f)
                arcTo(5.77f, 5.77f, 0.0f, false, false, 17.0f, 12.0f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, false, 5.0f, -4.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -3.5f, 1.51f)
                close()
                moveTo(5.5f, 14.49f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, 1.91f, 1.34f)
                arcTo(5.77f, 5.77f, 0.0f, false, false, 12.0f, 18.0f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, false, 5.0f, -4.0f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -3.5f, 1.49f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, true, -1.91f, -1.35f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 7.0f, 12.0f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, false, -5.0f, 4.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 3.5f, -1.51f)
                close()
            }
        }
        .build()
        return _bxlTailwindCss!!
    }

private var _bxlTailwindCss: ImageVector? = null
