package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.906f, 9.0f)
                curveTo(20.288f, 9.0f, 20.655f, 9.057f, 21.0f, 9.162f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 7.343f, 19.657f, 6.0f, 18.0f, 6.0f)
                horizontalLineTo(14.121f)
                curveTo(13.922f, 6.0f, 13.732f, 5.921f, 13.591f, 5.78f)
                lineTo(11.47f, 3.659f)
                curveTo(11.048f, 3.237f, 10.475f, 3.0f, 9.879f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(9.162f)
                curveTo(3.345f, 9.057f, 3.712f, 9.0f, 4.094f, 9.0f)
                horizontalLineTo(19.906f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.094f, 10.5f)
                curveTo(2.725f, 10.5f, 1.673f, 11.713f, 1.867f, 13.068f)
                lineTo(2.724f, 19.068f)
                curveTo(2.882f, 20.177f, 3.832f, 21.0f, 4.951f, 21.0f)
                horizontalLineTo(19.049f)
                curveTo(20.168f, 21.0f, 21.118f, 20.177f, 21.276f, 19.068f)
                lineTo(22.133f, 13.068f)
                curveTo(22.327f, 11.713f, 21.275f, 10.5f, 19.906f, 10.5f)
                horizontalLineTo(4.094f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
