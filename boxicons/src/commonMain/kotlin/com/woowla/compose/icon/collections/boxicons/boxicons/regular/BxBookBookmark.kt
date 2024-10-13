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

public val RegularGroup.BxBookBookmark: ImageVector
    get() {
        if (_bxBookBookmark != null) {
            return _bxBookBookmark!!
        }
        _bxBookBookmark = Builder(name = "BxBookBookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.01f)
                lineTo(6.0f, 2.01f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.012f, 20.01f)
                curveTo(5.55f, 19.998f, 5.0f, 19.815f, 5.0f, 19.01f)
                curveToRelative(0.0f, -0.101f, 0.009f, -0.191f, 0.024f, -0.273f)
                curveToRelative(0.112f, -0.575f, 0.583f, -0.717f, 0.987f, -0.727f)
                lineTo(20.0f, 18.01f)
                curveToRelative(0.018f, 0.0f, 0.031f, -0.009f, 0.049f, -0.01f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 4.01f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 16.01f)
                lineTo(5.0f, 16.01f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.806f, 0.55f, -0.988f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bxBookBookmark!!
    }

private var _bxBookBookmark: ImageVector? = null
