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

public val SolidGroup.BxsCalculator: ImageVector
    get() {
        if (_bxsCalculator != null) {
            return _bxsCalculator!!
        }
        _bxsCalculator = Builder(name = "BxsCalculator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(9.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsCalculator!!
    }

private var _bxsCalculator: ImageVector? = null