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

public val RegularGroup.BxTrophy: ImageVector
    get() {
        if (_bxTrophy != null) {
            return _bxTrophy!!
        }
        _bxTrophy = Builder(name = "BxTrophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(7.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 4.31f, 1.799f, 6.91f, 4.819f, 7.012f)
                arcTo(6.001f, 6.001f, 0.0f, false, false, 11.0f, 17.91f)
                lineTo(11.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.09f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 4.181f, -2.898f)
                curveTo(20.201f, 14.91f, 22.0f, 12.31f, 22.0f, 8.0f)
                lineTo(22.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.83f)
                curveTo(4.216f, 12.078f, 4.0f, 9.299f, 4.0f, 8.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(18.0f, 12.83f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.299f, -0.216f, 4.078f, -2.0f, 4.83f)
                close()
            }
        }
        .build()
        return _bxTrophy!!
    }

private var _bxTrophy: ImageVector? = null
