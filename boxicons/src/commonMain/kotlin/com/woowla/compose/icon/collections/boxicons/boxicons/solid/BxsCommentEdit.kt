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

public val SolidGroup.BxsCommentEdit: ImageVector
    get() {
        if (_bxsCommentEdit != null) {
            return _bxsCommentEdit!!
        }
        _bxsCommentEdit = Builder(name = "BxsCommentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.999f, 14.987f)
                lineTo(7.0f, 14.987f)
                verticalLineToRelative(-1.999f)
                lineToRelative(5.53f, -5.522f)
                lineToRelative(1.998f, 1.999f)
                lineToRelative(-5.529f, 5.522f)
                close()
                moveTo(15.471f, 8.523f)
                lineTo(13.472f, 6.524f)
                lineTo(14.996f, 5.001f)
                lineTo(16.995f, 7.0f)
                lineToRelative(-1.524f, 1.523f)
                close()
            }
        }
        .build()
        return _bxsCommentEdit!!
    }

private var _bxsCommentEdit: ImageVector? = null
