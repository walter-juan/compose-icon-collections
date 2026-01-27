package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.GitBranchCheck16: ImageVector
    get() {
        if (_gitBranchCheck16 != null) {
            return _gitBranchCheck16!!
        }
        _gitBranchCheck16 = Builder(name = "GitBranchCheck16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.26f, 10.0f)
                arcToRelative(0.741f, 0.741f, 0.0f, false, true, 0.414f, 0.133f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.154f)
                lineToRelative(-4.557f, 4.45f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -1.055f, -0.008f)
                lineToRelative(-1.943f, -1.95f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, 0.024f, -1.038f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 1.038f, -0.022f)
                lineToRelative(1.42f, 1.427f)
                lineToRelative(4.026f, -3.933f)
                arcTo(0.752f, 0.752f, 0.0f, false, true, 15.26f, 10.0f)
                close()
                moveTo(11.75f, 1.0f)
                arcToRelative(2.252f, 2.252f, 0.0f, false, true, 1.942f, 3.389f)
                arcToRelative(2.252f, 2.252f, 0.0f, false, true, -1.192f, 0.983f)
                lineTo(12.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 8.5f)
                lineTo(6.0f, 8.5f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.128f)
                arcToRelative(2.256f, 2.256f, 0.0f, false, true, 1.469f, 2.503f)
                arcTo(2.252f, 2.252f, 0.0f, true, true, 3.5f, 10.628f)
                lineTo(3.5f, 5.372f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, true, -1.469f, -2.503f)
                arcTo(2.252f, 2.252f, 0.0f, true, true, 5.0f, 5.372f)
                verticalLineToRelative(1.836f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 6.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-0.628f)
                arcTo(2.252f, 2.252f, 0.0f, false, true, 11.75f, 1.0f)
                close()
                moveTo(4.25f, 2.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 1.06f, 0.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                close()
                moveTo(4.25f, 12.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 1.06f, 0.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                close()
                moveTo(11.75f, 2.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 1.06f, 0.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                close()
            }
        }
        .build()
        return _gitBranchCheck16!!
    }

private var _gitBranchCheck16: ImageVector? = null
