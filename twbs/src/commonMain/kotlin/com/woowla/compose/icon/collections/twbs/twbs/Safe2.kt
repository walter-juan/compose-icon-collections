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

public val Twbs.Safe2: ImageVector
    get() {
        if (_safe2 != null) {
            return _safe2!!
        }
        _safe2 = Builder(name = "Safe2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 2.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(2.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.035f, 8.0f)
                horizontalLineToRelative(1.528f)
                quadToRelative(0.072f, -0.277f, 0.214f, -0.516f)
                lineToRelative(-1.08f, -1.08f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.035f, 8.0f)
                moveToRelative(1.369f, -2.303f)
                lineToRelative(1.08f, 1.08f)
                quadToRelative(0.24f, -0.142f, 0.516f, -0.214f)
                verticalLineTo(5.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.596f, 0.662f)
                moveTo(9.0f, 5.035f)
                verticalLineToRelative(1.528f)
                quadToRelative(0.277f, 0.072f, 0.516f, 0.214f)
                lineToRelative(1.08f, -1.08f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 5.035f)
                moveToRelative(2.303f, 1.369f)
                lineToRelative(-1.08f, 1.08f)
                quadToRelative(0.142f, 0.24f, 0.214f, 0.516f)
                horizontalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.662f, -1.596f)
                moveTo(11.965f, 9.0f)
                horizontalLineToRelative(-1.528f)
                quadToRelative(-0.072f, 0.277f, -0.214f, 0.516f)
                lineToRelative(1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.965f, 9.0f)
                moveToRelative(-1.369f, 2.303f)
                lineToRelative(-1.08f, -1.08f)
                quadToRelative(-0.24f, 0.142f, -0.516f, 0.214f)
                verticalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.596f, -0.662f)
                moveTo(8.0f, 11.965f)
                verticalLineToRelative(-1.528f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.516f, -0.214f)
                lineToRelative(-1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 11.965f)
                moveToRelative(-2.303f, -1.369f)
                lineToRelative(1.08f, -1.08f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.563f, 9.0f)
                horizontalLineTo(5.035f)
                curveToRelative(0.085f, 0.593f, 0.319f, 1.138f, 0.662f, 1.596f)
                moveTo(4.0f, 8.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                moveToRelative(4.5f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _safe2!!
    }

private var _safe2: ImageVector? = null
