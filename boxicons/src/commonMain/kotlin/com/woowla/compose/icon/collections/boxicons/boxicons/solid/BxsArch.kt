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

public val SolidGroup.BxsArch: ImageVector
    get() {
        if (_bxsArch != null) {
            return _bxsArch!!
        }
        _bxsArch = Builder(name = "BxsArch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.163f, 0.046f, -4.0f, 4.0f, -4.0f)
                curveToRelative(3.821f, 0.0f, 3.993f, 3.602f, 4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _bxsArch!!
    }

private var _bxsArch: ImageVector? = null