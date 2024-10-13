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

public val RegularGroup.BxDownvote: ImageVector
    get() {
        if (_bxDownvote != null) {
            return _bxDownvote!!
        }
        _bxDownvote = Builder(name = "BxDownvote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.901f, 10.566f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 20.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.781f, 1.625f)
                lineToRelative(8.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.562f, 0.0f)
                lineToRelative(8.0f, -10.0f)
                curveToRelative(0.24f, -0.301f, 0.286f, -0.712f, 0.12f, -1.059f)
                close()
                moveTo(12.0f, 19.399f)
                lineTo(6.081f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.919f)
                lineTo(12.0f, 19.399f)
                close()
            }
        }
        .build()
        return _bxDownvote!!
    }

private var _bxDownvote: ImageVector? = null
