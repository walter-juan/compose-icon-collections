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

public val Octicons.RepoDelete24: ImageVector
    get() {
        if (_repoDelete24 != null) {
            return _repoDelete24!!
        }
        _repoDelete24 = Builder(name = "RepoDelete24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 2.75f)
                verticalLineToRelative(16.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 22.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineTo(18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 16.5f)
                horizontalLineToRelative(7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.546f, 0.0f, -1.059f, 0.146f, -1.5f, 0.401f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineTo(18.5f)
                verticalLineToRelative(12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.22f, 16.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineTo(19.0f, 18.94f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(20.06f, 20.0f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(19.0f, 21.06f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(17.94f, 20.0f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _repoDelete24!!
    }

private var _repoDelete24: ImageVector? = null
