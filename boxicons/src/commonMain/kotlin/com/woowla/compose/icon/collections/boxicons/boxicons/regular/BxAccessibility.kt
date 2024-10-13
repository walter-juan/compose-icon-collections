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

public val RegularGroup.BxAccessibility: ImageVector
    get() {
        if (_bxAccessibility != null) {
            return _bxAccessibility!!
        }
        _bxAccessibility = Builder(name = "BxAccessibility", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.836f, 12.014f)
                lineToRelative(-4.345f, 0.725f)
                lineToRelative(3.29f, -4.113f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.227f, -1.457f)
                lineToRelative(-6.0f, -4.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.262f, 0.125f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.42f, -3.42f)
                lineToRelative(2.584f, 1.723f)
                lineToRelative(-2.681f, 3.352f)
                arcToRelative(5.913f, 5.913f, 0.0f, false, false, -5.5f, 0.752f)
                lineToRelative(1.451f, 1.451f)
                arcTo(3.972f, 3.972f, 0.0f, false, true, 8.0f, 12.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.739f, -0.216f, 1.425f, -0.566f, 2.02f)
                lineToRelative(1.451f, 1.451f)
                arcTo(5.961f, 5.961f, 0.0f, false, false, 14.0f, 16.0f)
                curveToRelative(0.0f, -0.445f, -0.053f, -0.878f, -0.145f, -1.295f)
                lineTo(17.0f, 14.181f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.164f, -0.986f)
                close()
                moveTo(8.0f, 20.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.739f, 0.216f, -1.425f, 0.566f, -2.02f)
                lineToRelative(-1.451f, -1.451f)
                arcTo(5.961f, 5.961f, 0.0f, false, false, 2.0f, 16.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.294f, 0.0f, 2.49f, -0.416f, 3.471f, -1.115f)
                lineToRelative(-1.451f, -1.451f)
                arcTo(3.972f, 3.972f, 0.0f, false, true, 8.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxAccessibility!!
    }

private var _bxAccessibility: ImageVector? = null
