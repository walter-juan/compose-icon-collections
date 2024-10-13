package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBookmark: ImageVector
    get() {
        if (_bxBookmark != null) {
            return _bxBookmark!!
        }
        _bxBookmark = Builder(name = "BxBookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(8.0f, -4.572f)
                lineTo(20.0f, 22.0f)
                lineTo(20.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 18.553f)
                lineTo(12.0f, 15.125f)
                lineTo(6.0f, 18.553f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(14.553f)
                close()
            }
        }
        .build()
        return _bxBookmark!!
    }

private var _bxBookmark: ImageVector? = null
