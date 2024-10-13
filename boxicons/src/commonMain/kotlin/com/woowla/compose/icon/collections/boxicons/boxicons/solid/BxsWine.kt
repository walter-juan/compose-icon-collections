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

public val SolidGroup.BxsWine: ImageVector
    get() {
        if (_bxsWine != null) {
            return _bxsWine!!
        }
        _bxsWine = Builder(name = "BxsWine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.916f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.084f)
                curveToRelative(3.162f, -0.402f, 5.849f, -2.66f, 6.713f, -5.793f)
                curveToRelative(0.264f, -0.952f, 0.312f, -2.03f, 0.143f, -3.206f)
                lineToRelative(-0.866f, -6.059f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.99f, 0.858f)
                lineToRelative(-0.865f, 6.058f)
                curveToRelative(-0.169f, 1.177f, -0.121f, 2.255f, 0.143f, 3.206f)
                curveToRelative(0.863f, 3.134f, 3.55f, 5.392f, 6.712f, 5.794f)
                close()
                moveTo(17.133f, 4.0f)
                lineToRelative(0.57f, 4.0f)
                horizontalLineTo(6.296f)
                lineToRelative(0.571f, -4.0f)
                horizontalLineToRelative(10.266f)
                close()
            }
        }
        .build()
        return _bxsWine!!
    }

private var _bxsWine: ImageVector? = null
