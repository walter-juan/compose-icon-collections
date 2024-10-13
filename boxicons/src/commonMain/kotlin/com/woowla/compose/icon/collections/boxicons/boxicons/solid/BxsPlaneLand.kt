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

public val SolidGroup.BxsPlaneLand: ImageVector
    get() {
        if (_bxsPlaneLand != null) {
            return _bxsPlaneLand!!
        }
        _bxsPlaneLand = Builder(name = "BxsPlaneLand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.842f, 15.296f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, 1.892f, -1.189f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.609f, 1.609f, 0.0f, false, false, -1.177f, -1.949f)
                lineToRelative(-4.576f, -1.133f)
                lineTo(9.825f, 4.21f)
                lineToRelative(-2.224f, -0.225f)
                lineToRelative(2.931f, 6.589f)
                lineToRelative(-4.449f, -0.449f)
                lineToRelative(-2.312f, -3.829f)
                lineToRelative(-1.38f, 0.31f)
                lineToRelative(1.24f, 5.52f)
                lineToRelative(15.211f, 3.17f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _bxsPlaneLand!!
    }

private var _bxsPlaneLand: ImageVector? = null
