package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBookBookmark: ImageVector
    get() {
        if (_bxsBookBookmark != null) {
            return _bxsBookBookmark!!
        }
        _bxsBookBookmark = Builder(name = "BxsBookBookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.012f, 20.0f)
                curveTo(5.55f, 19.988f, 5.0f, 19.806f, 5.0f, 19.0f)
                curveToRelative(0.0f, -0.101f, 0.009f, -0.191f, 0.024f, -0.273f)
                curveToRelative(0.112f, -0.576f, 0.584f, -0.717f, 0.988f, -0.727f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _bxsBookBookmark!!
    }

private var _bxsBookBookmark: ImageVector? = null
