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

public val RegularGroup.BxUpvote: ImageVector
    get() {
        if (_bxUpvote != null) {
            return _bxUpvote!!
        }
        _bxUpvote = Builder(name = "BxUpvote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.781f, 2.375f)
                curveToRelative(-0.381f, -0.475f, -1.181f, -0.475f, -1.562f, 0.0f)
                lineToRelative(-8.0f, 10.0f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 4.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.781f, -1.625f)
                lineToRelative(-8.0f, -10.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(6.081f)
                lineTo(12.0f, 4.601f)
                lineTo(17.919f, 12.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bxUpvote!!
    }

private var _bxUpvote: ImageVector? = null
