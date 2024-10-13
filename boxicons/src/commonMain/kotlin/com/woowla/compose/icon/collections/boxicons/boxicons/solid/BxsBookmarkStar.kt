package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBookmarkStar: ImageVector
    get() {
        if (_bxsBookmarkStar != null) {
            return _bxsBookmarkStar!!
        }
        _bxsBookmarkStar = Builder(name = "BxsBookmarkStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.222f)
                lineTo(14.667f, 13.0f)
                lineToRelative(-0.89f, -3.111f)
                lineTo(16.0f, 8.0f)
                lineToRelative(-2.667f, -0.333f)
                lineTo(12.0f, 5.0f)
                lineToRelative(-1.333f, 2.667f)
                lineTo(8.0f, 8.0f)
                lineToRelative(2.223f, 1.889f)
                lineTo(9.333f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.723f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(17.723f)
                lineToRelative(7.0f, -4.571f)
                lineToRelative(7.0f, 4.571f)
                close()
                moveTo(8.0f, 8.0f)
                lineToRelative(2.667f, -0.333f)
                lineTo(12.0f, 5.0f)
                lineToRelative(1.333f, 2.667f)
                lineTo(16.0f, 8.0f)
                lineToRelative(-2.223f, 1.889f)
                lineToRelative(0.89f, 3.111f)
                lineTo(12.0f, 11.222f)
                lineTo(9.333f, 13.0f)
                lineToRelative(0.89f, -3.111f)
                lineTo(8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsBookmarkStar!!
    }

private var _bxsBookmarkStar: ImageVector? = null
