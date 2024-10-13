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

public val LogosGroup.BxlTiktok: ImageVector
    get() {
        if (_bxlTiktok != null) {
            return _bxlTiktok!!
        }
        _bxlTiktok = Builder(name = "BxlTiktok", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 6.69f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, -3.77f, -4.25f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-3.45f)
                verticalLineToRelative(13.67f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -5.2f, 1.74f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 2.31f, -4.64f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, 0.88f, 0.13f)
                verticalLineTo(9.4f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, false, -1.0f, -0.05f)
                arcTo(6.33f, 6.33f, 0.0f, false, false, 5.0f, 20.1f)
                arcToRelative(6.34f, 6.34f, 0.0f, false, false, 10.86f, -4.43f)
                verticalLineToRelative(-7.0f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, false, 4.77f, 1.52f)
                verticalLineToRelative(-3.4f)
                arcToRelative(4.85f, 4.85f, 0.0f, false, true, -1.0f, -0.1f)
                close()
            }
        }
        .build()
        return _bxlTiktok!!
    }

private var _bxlTiktok: ImageVector? = null
