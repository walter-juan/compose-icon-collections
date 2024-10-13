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

public val RegularGroup.BxShare: ImageVector
    get() {
        if (_bxShare != null) {
            return _bxShare!!
        }
        _bxShare = Builder(name = "BxShare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.05f)
                lineTo(11.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.7f, 0.29f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                verticalLineToRelative(-3.1f)
                horizontalLineToRelative(0.85f)
                arcToRelative(10.89f, 10.89f, 0.0f, false, true, 8.36f, 3.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.11f, 0.35f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 18.0f)
                curveToRelative(0.0f, -9.12f, -8.08f, -10.68f, -11.0f, -10.95f)
                close()
                moveTo(11.85f, 12.88f)
                arcToRelative(14.74f, 14.74f, 0.0f, false, false, -2.0f, 0.13f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 14.0f)
                verticalLineToRelative(1.59f)
                lineTo(4.42f, 11.0f)
                lineTo(9.0f, 6.41f)
                lineTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                curveToRelative(0.91f, 0.0f, 8.11f, 0.2f, 9.67f, 6.43f)
                arcToRelative(13.07f, 13.07f, 0.0f, false, false, -7.82f, -2.55f)
                close()
            }
        }
        .build()
        return _bxShare!!
    }

private var _bxShare: ImageVector? = null
