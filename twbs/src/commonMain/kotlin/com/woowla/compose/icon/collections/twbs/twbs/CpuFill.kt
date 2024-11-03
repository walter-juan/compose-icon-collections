package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CpuFill: ImageVector
    get() {
        if (_cpuFill != null) {
            return _cpuFill!!
        }
        _cpuFill = Builder(name = "CpuFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(4.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 4.5f)
                lineTo(0.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(2.0f, 5.5f)
                verticalLineToRelative(1.0f)
                lineTo(0.5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(2.0f, 7.5f)
                verticalLineToRelative(1.0f)
                lineTo(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(2.0f, 9.5f)
                verticalLineToRelative(1.0f)
                lineTo(0.5f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(2.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 14.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(5.5f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(7.5f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(9.5f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(11.5f, 14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(14.0f, 10.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(14.0f, 8.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(14.0f, 6.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(14.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 2.0f)
                lineTo(11.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(9.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(8.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(6.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 6.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 9.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 5.0f)
            }
        }
        .build()
        return _cpuFill!!
    }

private var _cpuFill: ImageVector? = null
