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

public val RegularGroup.BxHandicap: ImageVector
    get() {
        if (_bxHandicap != null) {
            return _bxHandicap!!
        }
        _bxHandicap = Builder(name = "BxHandicap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.98f, 14.804f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.0f)
                horizontalLineToRelative(-4.133f)
                lineToRelative(-0.429f, -3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-4.847f)
                lineToRelative(-0.163f, -1.142f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 7.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.99f, 1.142f)
                lineToRelative(0.877f, 6.142f)
                arcTo(2.009f, 2.009f, 0.0f, false, false, 10.867f, 16.0f)
                horizontalLineToRelative(4.313f)
                lineToRelative(0.839f, 4.196f)
                curveToRelative(0.094f, 0.467f, 0.504f, 0.804f, 0.981f, 0.804f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.181f)
                lineToRelative(-0.839f, -4.196f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.51f, 17.5f)
                curveToRelative(-0.739f, 1.476f, -2.25f, 2.5f, -4.01f, 2.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.0f, 15.5f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, 2.817f, -4.167f)
                lineToRelative(-0.289f, -2.025f)
                curveTo(3.905f, 10.145f, 2.0f, 12.604f, 2.0f, 15.5f)
                curveTo(2.0f, 19.084f, 4.916f, 22.0f, 8.5f, 22.0f)
                arcToRelative(6.497f, 6.497f, 0.0f, false, false, 5.545f, -3.126f)
                lineToRelative(-0.274f, -1.374f)
                horizontalLineTo(12.51f)
                close()
            }
        }
        .build()
        return _bxHandicap!!
    }

private var _bxHandicap: ImageVector? = null
