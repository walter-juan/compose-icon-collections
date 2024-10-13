package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCommentEdit: ImageVector
    get() {
        if (_bxCommentEdit != null) {
            return _bxCommentEdit!!
        }
        _bxCommentEdit = Builder(name = "BxCommentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.771f, 9.123f)
                lineToRelative(-1.399f, -1.398f)
                lineToRelative(-3.869f, 3.864f)
                verticalLineToRelative(1.398f)
                horizontalLineToRelative(1.398f)
                close()
                moveTo(14.098f, 6.0f)
                lineToRelative(1.398f, 1.398f)
                lineToRelative(-1.067f, 1.067f)
                lineToRelative(-1.398f, -1.398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(5.333f, -4.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(6.667f, 16.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bxCommentEdit!!
    }

private var _bxCommentEdit: ImageVector? = null
