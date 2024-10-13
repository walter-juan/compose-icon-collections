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

public val SolidGroup.BxsUpvote: ImageVector
    get() {
        if (_bxsUpvote != null) {
            return _bxsUpvote!!
        }
        _bxsUpvote = Builder(name = "BxsUpvote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.781f, -1.625f)
                lineToRelative(-8.0f, -10.0f)
                curveToRelative(-0.381f, -0.475f, -1.181f, -0.475f, -1.562f, 0.0f)
                lineToRelative(-8.0f, 10.0f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxsUpvote!!
    }

private var _bxsUpvote: ImageVector? = null
