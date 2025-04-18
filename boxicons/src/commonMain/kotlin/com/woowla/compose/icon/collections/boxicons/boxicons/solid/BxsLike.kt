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

public val SolidGroup.BxsLike: ImageVector
    get() {
        if (_bxsLike != null) {
            return _bxsLike!!
        }
        _bxsLike = Builder(name = "BxsLike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(1.122f, -3.368f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.225f, 2.0f)
                horizontalLineTo(12.0f)
                lineTo(7.0f, 7.438f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(3.912f, -8.596f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxsLike!!
    }

private var _bxsLike: ImageVector? = null
