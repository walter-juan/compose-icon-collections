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

public val SolidGroup.BxsTraffic: ImageVector
    get() {
        if (_bxsTraffic != null) {
            return _bxsTraffic!!
        }
        _bxsTraffic = Builder(name = "BxsTraffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.958f, 16.0f)
                lineToRelative(0.043f, 1.042f)
                curveToRelative(0.005f, 0.12f, 0.142f, 2.255f, 2.999f, 3.338f)
                verticalLineToRelative(1.12f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.12f)
                curveToRelative(2.857f, -1.083f, 2.994f, -3.218f, 2.999f, -3.338f)
                lineTo(21.043f, 16.0f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(-1.62f)
                curveToRelative(2.857f, -1.083f, 2.994f, -3.218f, 2.999f, -3.338f)
                lineTo(21.043f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.38f)
                curveToRelative(2.857f, -1.083f, 2.994f, -3.218f, 2.999f, -3.338f)
                lineTo(21.043f, 4.0f)
                lineTo(18.0f, 4.0f)
                lineTo(18.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(6.0f, 4.0f)
                lineTo(2.958f, 4.0f)
                lineToRelative(0.043f, 1.042f)
                curveToRelative(0.005f, 0.12f, 0.142f, 2.255f, 2.999f, 3.338f)
                lineTo(6.0f, 10.0f)
                lineTo(2.958f, 10.0f)
                lineToRelative(0.043f, 1.042f)
                curveToRelative(0.005f, 0.12f, 0.142f, 2.255f, 2.999f, 3.338f)
                lineTo(6.0f, 16.0f)
                lineTo(2.958f, 16.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, 4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, 4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, 4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bxsTraffic!!
    }

private var _bxsTraffic: ImageVector? = null
