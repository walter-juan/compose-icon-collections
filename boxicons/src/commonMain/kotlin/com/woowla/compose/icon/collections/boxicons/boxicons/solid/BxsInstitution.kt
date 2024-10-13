package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsInstitution: ImageVector
    get() {
        if (_bxsInstitution != null) {
            return _bxsInstitution!!
        }
        _bxsInstitution = Builder(name = "BxsInstitution", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.857f, 8.485f)
                lineToRelative(-3.0f, -5.0f)
                arcTo(0.997f, 0.997f, 0.0f, false, false, 18.0f, 3.0f)
                horizontalLineToRelative(-4.586f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(10.586f, 3.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.857f, 0.485f)
                lineToRelative(-3.0f, 5.0f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 2.002f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(0.0f, -0.178f, -0.046f, -0.356f, -0.141f, -0.515f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.414f)
                lineToRelative(0.293f, -0.293f)
                lineToRelative(2.0f, -2.0f)
                lineTo(12.0f, 4.414f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.293f, 0.293f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.895f, 9.895f)
                moveToRelative(-2.105f, 0.0f)
                arcToRelative(2.105f, 2.105f, 0.0f, true, true, 4.21f, 0.0f)
                arcToRelative(2.105f, 2.105f, 0.0f, true, true, -4.21f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxsInstitution!!
    }

private var _bxsInstitution: ImageVector? = null
