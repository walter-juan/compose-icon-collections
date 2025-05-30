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

public val RegularGroup.BxChild: ImageVector
    get() {
        if (_bxChild != null) {
            return _bxChild!!
        }
        _bxChild = Builder(name = "BxChild", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineToRelative(-3.0f, 4.0f)
                lineToRelative(1.6f, 1.2f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(1.2f, 1.6f)
                lineToRelative(1.6f, -1.2f)
                lineToRelative(-3.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxChild!!
    }

private var _bxChild: ImageVector? = null
